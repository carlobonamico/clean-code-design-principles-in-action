export class JsonFileReader {

    constructor(){
        
    }

    load(name) {
        let fileContent: any;
        window["jQuery"].ajax({
            url: name,
            success: (response) => {
                console.log(response)
                fileContent = JSON.parse(response.message);
            },
            async: false
        });

        return fileContent;
    }

}