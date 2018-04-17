package org.modelcatalogue.core.audit

import grails.transaction.Transactional
import org.modelcatalogue.core.DataModel

import java.text.SimpleDateFormat

@Transactional
class ChangeService {
    def addNewChangeToDataModel() {
        String dmName = 'Test Data Model'
        DataModel dm = DataModel.findByName(dmName)
        if (!dm) {
            dm = new DataModel(name: dmName)
            dm.save(flush:true)
        }
        SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy HH:mm:ss')
        Change change = new Change(description: "New change at ${sdf.format(new Date())}", dataModel: dm)
        change.save(flush:true)
        dm.changes.add(change)
        dm.save(flush:true)
    }
    def serviceMethod() {

    }
}
