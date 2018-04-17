package org.modelcatalogue.core.audit

import grails.transaction.Transactional
import org.modelcatalogue.core.DataModel

import java.text.SimpleDateFormat

class ChangeService {

    DataModelGormService dataModelGormService
    ChangeGormService changeGormService

    def addNewChangeToDataModel() {
        String dmName = 'Test Data Model'
        DataModel dm = dataModelGormService.findByName(dmName)
        if ( !dm ) {
            dm = dataModelGormService.save(dmName)
        }

        if ( !dm.hasErrors() ) {
            SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy HH:mm:ss')
            final String description =  "New change at ${sdf.format(new Date())}"
            Change change = changeGormService.save(description, dm)
        }


    }

    def serviceMethod() {

    }
}
