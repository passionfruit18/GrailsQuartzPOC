package org.modelcatalogue.core.audit

import org.modelcatalogue.core.DataModel

class Change {
    String description

    static belongsTo = [dataModel: DataModel]
    static constraints = {
    }
}
