package org.modelcatalogue.core

import org.modelcatalogue.core.audit.Change

class DataModel {
    static hasMany = [changes: Change]
    Date dateCreated

    static constraints = {
    }
}
