package org.modelcatalogue.core

import org.modelcatalogue.core.audit.Change

class DataModel {

    static hasMany = [changes: Change]

    String name

    static constraints = {
        name nullable: false, unique: true
        changes nullable: true
    }
}
