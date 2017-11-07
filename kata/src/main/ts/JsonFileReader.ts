export default class JsonFileReader {

    constructor(){
        
    }
    load(name) {
        let fileContent: any;
        window["jQuery"].ajax({
            url: name,
            success: (response) => {
                console.log(response)
                fileContent = response;
            },
            async: false
        });

        return fileContent;
    }

}