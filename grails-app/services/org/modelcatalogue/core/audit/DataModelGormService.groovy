package org.modelcatalogue.core.audit

import grails.transaction.Transactional
import groovy.util.logging.Slf4j
import org.modelcatalogue.core.DataModel

@Slf4j
@Transactional
class DataModelGormService {

    DataModel save(String name, boolean flush = true) {
        DataModel dataModel = new DataModel()
        dataModel.name = name
        if ( !dataModel.save(insert: true, flush: flush) ) {
            log.error('error while saving data model')
        }

        dataModel
    }

    @Transactional(readOnly = true)
    DataModel findByName(String name ) {
        DataModel.findByName(name)
    }
}
