package url.mappings.sample

import grails.rest.RestfulController

class MailController extends RestfulController<Mail>{

    MailController() {
        super(Mail)
    }

    def getUnreadCount() {
        respond([unread: 1])
    }
}
