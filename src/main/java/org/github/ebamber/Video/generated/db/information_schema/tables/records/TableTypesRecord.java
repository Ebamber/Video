/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.information_schema.tables.records;


import org.github.ebamber.Video.generated.db.information_schema.tables.TableTypes;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableTypesRecord extends TableRecordImpl<TableTypesRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_TYPES.TYPE</code>.
     */
    public void setType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_TYPES.TYPE</code>.
     */
    public String getType() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TableTypes.TABLE_TYPES.TYPE;
    }

    @Override
    public String component1() {
        return getType();
    }

    @Override
    public String value1() {
        return getType();
    }

    @Override
    public TableTypesRecord value1(String value) {
        setType(value);
        return this;
    }

    @Override
    public TableTypesRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableTypesRecord
     */
    public TableTypesRecord() {
        super(TableTypes.TABLE_TYPES);
    }

    /**
     * Create a detached, initialised TableTypesRecord
     */
    public TableTypesRecord(String type) {
        super(TableTypes.TABLE_TYPES);

        setType(type);
    }
}
