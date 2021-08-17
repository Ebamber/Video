/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.information_schema.tables.records;


import org.github.ebamber.Video.generated.db.information_schema.tables.InDoubt;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InDoubtRecord extends TableRecordImpl<InDoubtRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION</code>.
     */
    public void setTransaction(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION</code>.
     */
    public String getTransaction() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.STATE</code>.
     */
    public void setState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.STATE</code>.
     */
    public String getState() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InDoubt.IN_DOUBT.TRANSACTION;
    }

    @Override
    public Field<String> field2() {
        return InDoubt.IN_DOUBT.STATE;
    }

    @Override
    public String component1() {
        return getTransaction();
    }

    @Override
    public String component2() {
        return getState();
    }

    @Override
    public String value1() {
        return getTransaction();
    }

    @Override
    public String value2() {
        return getState();
    }

    @Override
    public InDoubtRecord value1(String value) {
        setTransaction(value);
        return this;
    }

    @Override
    public InDoubtRecord value2(String value) {
        setState(value);
        return this;
    }

    @Override
    public InDoubtRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InDoubtRecord
     */
    public InDoubtRecord() {
        super(InDoubt.IN_DOUBT);
    }

    /**
     * Create a detached, initialised InDoubtRecord
     */
    public InDoubtRecord(String transaction, String state) {
        super(InDoubt.IN_DOUBT);

        setTransaction(transaction);
        setState(state);
    }
}
