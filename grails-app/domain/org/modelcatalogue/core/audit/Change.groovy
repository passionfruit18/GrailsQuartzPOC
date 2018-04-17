package org.modelcatalogue.core.audit

import org.modelcatalogue.core.DataModel

class Change {
    String description

    static belongsTo = [dataModel: DataModel]


    static constraints = {
        description nullable: false
    }

    static mapping = {
        table '`change`'
        description type: 'text'

    }
}
