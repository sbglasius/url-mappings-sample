package url.mappings.sample

class UrlMappings {

    static mappings = {
        "/api/$controller/$action?/$id?(.$format)?"()
        "/api/$controller"(resource: controller)

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
