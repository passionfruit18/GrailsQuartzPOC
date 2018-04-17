package org.modelcatalogue.core.audit

import grails.transaction.Transactional
import groovy.util.logging.Slf4j
import org.modelcatalogue.core.DataModel

@Slf4j
@Transactional
class ChangeGormService {

    Change save(String description, DataModel dm, boolean flush = true) {
        Change change = new Change(description: description, dataModel: dm)
        if ( !change.save(insert: true, flush: flush) ) {
            log.error('error while saving Change')
        }
        change
    }

}
