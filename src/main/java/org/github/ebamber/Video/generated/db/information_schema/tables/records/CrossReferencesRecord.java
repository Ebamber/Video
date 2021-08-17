/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.information_schema.tables.records;


import org.github.ebamber.Video.generated.db.information_schema.tables.CrossReferences;
import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrossReferencesRecord extends TableRecordImpl<CrossReferencesRecord> implements Record14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
     */
    public void setPktableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
     */
    public String getPktableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
     */
    public void setPktableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
     */
    public String getPktableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
     */
    public void setPktableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
     */
    public String getPktableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
     */
    public void setPkcolumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
     */
    public String getPkcolumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
     */
    public void setFktableCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
     */
    public String getFktableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
     */
    public void setFktableSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
     */
    public String getFktableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
     */
    public void setFktableName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
     */
    public String getFktableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
     */
    public void setFkcolumnName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
     */
    public String getFkcolumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
     */
    public Short getOrdinalPosition() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
     */
    public void setUpdateRule(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
     */
    public Short getUpdateRule() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
     */
    public void setDeleteRule(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
     */
    public Short getDeleteRule() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
     */
    public void setFkName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
     */
    public String getFkName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
     */
    public void setPkName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
     */
    public String getPkName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
     */
    public void setDeferrability(Short value) {
        set(13, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
     */
    public Short getDeferrability() {
        return (Short) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, String, String, String, String, String, Short, Short, Short, String, String, Short> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CrossReferences.CROSS_REFERENCES.PKTABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return CrossReferences.CROSS_REFERENCES.PKTABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return CrossReferences.CROSS_REFERENCES.PKTABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return CrossReferences.CROSS_REFERENCES.PKCOLUMN_NAME;
    }

    @Override
    public Field<String> field5() {
        return CrossReferences.CROSS_REFERENCES.FKTABLE_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return CrossReferences.CROSS_REFERENCES.FKTABLE_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return CrossReferences.CROSS_REFERENCES.FKTABLE_NAME;
    }

    @Override
    public Field<String> field8() {
        return CrossReferences.CROSS_REFERENCES.FKCOLUMN_NAME;
    }

    @Override
    public Field<Short> field9() {
        return CrossReferences.CROSS_REFERENCES.ORDINAL_POSITION;
    }

    @Override
    public Field<Short> field10() {
        return CrossReferences.CROSS_REFERENCES.UPDATE_RULE;
    }

    @Override
    public Field<Short> field11() {
        return CrossReferences.CROSS_REFERENCES.DELETE_RULE;
    }

    @Override
    public Field<String> field12() {
        return CrossReferences.CROSS_REFERENCES.FK_NAME;
    }

    @Override
    public Field<String> field13() {
        return CrossReferences.CROSS_REFERENCES.PK_NAME;
    }

    @Override
    public Field<Short> field14() {
        return CrossReferences.CROSS_REFERENCES.DEFERRABILITY;
    }

    @Override
    public String component1() {
        return getPktableCatalog();
    }

    @Override
    public String component2() {
        return getPktableSchema();
    }

    @Override
    public String component3() {
        return getPktableName();
    }

    @Override
    public String component4() {
        return getPkcolumnName();
    }

    @Override
    public String component5() {
        return getFktableCatalog();
    }

    @Override
    public String component6() {
        return getFktableSchema();
    }

    @Override
    public String component7() {
        return getFktableName();
    }

    @Override
    public String component8() {
        return getFkcolumnName();
    }

    @Override
    public Short component9() {
        return getOrdinalPosition();
    }

    @Override
    public Short component10() {
        return getUpdateRule();
    }

    @Override
    public Short component11() {
        return getDeleteRule();
    }

    @Override
    public String component12() {
        return getFkName();
    }

    @Override
    public String component13() {
        return getPkName();
    }

    @Override
    public Short component14() {
        return getDeferrability();
    }

    @Override
    public String value1() {
        return getPktableCatalog();
    }

    @Override
    public String value2() {
        return getPktableSchema();
    }

    @Override
    public String value3() {
        return getPktableName();
    }

    @Override
    public String value4() {
        return getPkcolumnName();
    }

    @Override
    public String value5() {
        return getFktableCatalog();
    }

    @Override
    public String value6() {
        return getFktableSchema();
    }

    @Override
    public String value7() {
        return getFktableName();
    }

    @Override
    public String value8() {
        return getFkcolumnName();
    }

    @Override
    public Short value9() {
        return getOrdinalPosition();
    }

    @Override
    public Short value10() {
        return getUpdateRule();
    }

    @Override
    public Short value11() {
        return getDeleteRule();
    }

    @Override
    public String value12() {
        return getFkName();
    }

    @Override
    public String value13() {
        return getPkName();
    }

    @Override
    public Short value14() {
        return getDeferrability();
    }

    @Override
    public CrossReferencesRecord value1(String value) {
        setPktableCatalog(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value2(String value) {
        setPktableSchema(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value3(String value) {
        setPktableName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value4(String value) {
        setPkcolumnName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value5(String value) {
        setFktableCatalog(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value6(String value) {
        setFktableSchema(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value7(String value) {
        setFktableName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value8(String value) {
        setFkcolumnName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value9(Short value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value10(Short value) {
        setUpdateRule(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value11(Short value) {
        setDeleteRule(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value12(String value) {
        setFkName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value13(String value) {
        setPkName(value);
        return this;
    }

    @Override
    public CrossReferencesRecord value14(Short value) {
        setDeferrability(value);
        return this;
    }

    @Override
    public CrossReferencesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Short value9, Short value10, Short value11, String value12, String value13, Short value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CrossReferencesRecord
     */
    public CrossReferencesRecord() {
        super(CrossReferences.CROSS_REFERENCES);
    }

    /**
     * Create a detached, initialised CrossReferencesRecord
     */
    public CrossReferencesRecord(String pktableCatalog, String pktableSchema, String pktableName, String pkcolumnName, String fktableCatalog, String fktableSchema, String fktableName, String fkcolumnName, Short ordinalPosition, Short updateRule, Short deleteRule, String fkName, String pkName, Short deferrability) {
        super(CrossReferences.CROSS_REFERENCES);

        setPktableCatalog(pktableCatalog);
        setPktableSchema(pktableSchema);
        setPktableName(pktableName);
        setPkcolumnName(pkcolumnName);
        setFktableCatalog(fktableCatalog);
        setFktableSchema(fktableSchema);
        setFktableName(fktableName);
        setFkcolumnName(fkcolumnName);
        setOrdinalPosition(ordinalPosition);
        setUpdateRule(updateRule);
        setDeleteRule(deleteRule);
        setFkName(fkName);
        setPkName(pkName);
        setDeferrability(deferrability);
    }
}