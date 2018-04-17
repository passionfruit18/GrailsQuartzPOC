package grailsquartzpoc

import org.modelcatalogue.core.DataModel
import org.modelcatalogue.core.audit.Change
import org.modelcatalogue.core.audit.ChangeService


class CreateChangesJob {

    ChangeService changeService

    static triggers = {
      simple repeatInterval: 500l // execute job once in 5 seconds
    }

    def execute() {
        changeService.addNewChangeToDataModel()

    }
}
