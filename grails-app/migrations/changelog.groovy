databaseChangeLog = {

	changeSet(author: "james (generated)", id: "1523971138599-1") {
		createTable(tableName: "change") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "changePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "data_model_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "james (generated)", id: "1523971138599-2") {
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

	changeSet(author: "james (generated)", id: "1523971138599-4") {
		createIndex(indexName: "FK_n9y2c2y03j4hrc3n6lr02j1ey", tableName: "change") {
			column(name: "data_model_id")
		}
	}

	changeSet(author: "james (generated)", id: "1523971138599-3") {
		addForeignKeyConstraint(baseColumnNames: "data_model_id", baseTableName: "change", constraintName: "FK_n9y2c2y03j4hrc3n6lr02j1ey", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "data_model", referencesUniqueColumn: "false")
	}
}
