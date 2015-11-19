var gulp = require('gulp');

// Let's make things more readable by
// encapsulating each part's setup
// in its own method
var EXPRESS_PORT = 8000;
var EXPRESS_ROOT = __dirname;
var LIVERELOAD_PORT = 35729;

// Let's make things more readable by
// encapsulating each part's setup
// in its own method
function startExpress() {

  var express = require('express');
  var app = express();
  app.use(require('connect-livereload')());
  app.use(express.static(EXPRESS_ROOT));
  app.listen(EXPRESS_PORT);
}

// ...

// We'll need a reference to the tinylr
// object to send notifications of file changes
var lr;
function startLivereload() {

  lr = require('tiny-lr')();
  lr.listen(35729);
}


// Notifies livereload of changes detected
// by `gulp.watch()`
function notifyLivereload(event) {

  // `gulp.watch()` events provide an absolute path
  // so we need to make it relative to the server root
  var fileName = require('path').relative(EXPRESS_ROOT, event.path);

  lr.changed({
    body: {
      files: [fileName]
    }
  });
}
/*
// Default task that will be run
// when no parameter is provided
// to gulp
gulp.task('default', function () {

  startExpress();
  startLivereload();
  gulp.watch('*.html', notifyLivereload);
});

*/
// Default task that will be run
// when no parameter is provided
// to gulp
gulp.task('default', function () {

  startExpress();
  startLivereload();
  gulp.watch(['*.md','*.html' ], notifyLivereload);
});
