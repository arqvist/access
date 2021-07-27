package arqvist_access

class LocationsController {

    def index() {
        
        def locations = LocationService.list(params)
        def model = [locations: locations, message: "Locations index"]
        render view: 'index', model: model
    }
    def save() {
        def body = request.JSON
        def location = LocationService.save(body)
        render location
    }
    def show(Long id) {
        def location = LocationService.show(id)
        def message = "Retrieving location"
        def code = 200
        if (!location)
            code = 404
        def model = [location: location, message: "Retrieving location"]
        render view: 'show', model: model, status: code
    }
}
