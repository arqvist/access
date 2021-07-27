package arqvist_access

import grails.gorm.transactions.Transactional

@Transactional
class LocationService {

    static list (params) {
        Location.list(params)
    }
    static save(body) {
        def loc = new Location(body)
        def saved = loc.save()
        if (saved) {
            return loc
        }
        return false
    }

    static show(Long id) {
        def loc = Location.get(id)

    }
}
