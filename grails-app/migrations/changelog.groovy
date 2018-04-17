databaseChangeLog = {

	changeSet(author: "james (generated)", id: "1523969839579-1") {
		createTable(tableName: "change") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "changePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "james (generated)", id: "1523969839579-2") {
		createTable(tableName: "data_model") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "data_modelPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "james (generated)", id: "1523969839579-3") {
		createTable(tableName: "data_model_change") {
			column(name: "data_model_changes_id", type: "bigint")

			column(name: "change_id", type: "bigint")
		}
	}

	changeSet(author: "james (generated)", id: "1523969839579-6") {
		createIndex(indexName: "FK_c3o7aebcuw2u76rm422xkvrrs", tableName: "data_model_change") {
			column(name: "data_model_changes_id")
		}
	}

	changeSet(author: "james (generated)", id: "1523969839579-7") {
		createIndex(indexName: "FK_fgil01smvhwpdyrd3mhmx9vxh", tableName: "data_model_change") {
			column(name: "change_id")
		}
	}

	changeSet(author: "james (generated)", id: "1523969839579-4") {
		addForeignKeyConstraint(baseColumnNames: "change_id", baseTableName: "data_model_change", constraintName: "FK_fgil01smvhwpdyrd3mhmx9vxh", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "change", referencesUniqueColumn: "false")
	}

	changeSet(author: "james (generated)", id: "1523969839579-5") {
		addForeignKeyConstraint(baseColumnNames: "data_model_changes_id", baseTableName: "data_model_change", constraintName: "FK_c3o7aebcuw2u76rm422xkvrrs", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "data_model", referencesUniqueColumn: "false")
	}
}
