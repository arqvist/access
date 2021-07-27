package arqvist_access

class UrlMappings {

    static mappings = {
        // "/$controller/$action?/$id?(.$format)?"{
        //     constraints {
        //         // apply constraints here
        //     }
        // }
        "/locations" resources: 'locations'
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
