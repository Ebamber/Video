/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.public_.tables.records;


import org.github.ebamber.Video.generated.db.public_.tables.Video;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VideoRecord extends UpdatableRecordImpl<VideoRecord> implements Record5<String, String, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.VIDEO.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.VIDEO.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.VIDEO.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.VIDEO.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.VIDEO.TYPE</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.VIDEO.TYPE</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.VIDEO.OUTDATE</code>.
     */
    public void setOutdate(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.VIDEO.OUTDATE</code>.
     */
    public Long getOutdate() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>PUBLIC.VIDEO.RETURNDATE</code>.
     */
    public void setReturndate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.VIDEO.RETURNDATE</code>.
     */
    public Long getReturndate() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Video.VIDEO.ID;
    }

    @Override
    public Field<String> field2() {
        return Video.VIDEO.NAME;
    }

    @Override
    public Field<String> field3() {
        return Video.VIDEO.TYPE;
    }

    @Override
    public Field<Long> field4() {
        return Video.VIDEO.OUTDATE;
    }

    @Override
    public Field<Long> field5() {
        return Video.VIDEO.RETURNDATE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public Long component4() {
        return getOutdate();
    }

    @Override
    public Long component5() {
        return getReturndate();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public Long value4() {
        return getOutdate();
    }

    @Override
    public Long value5() {
        return getReturndate();
    }

    @Override
    public VideoRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public VideoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public VideoRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public VideoRecord value4(Long value) {
        setOutdate(value);
        return this;
    }

    @Override
    public VideoRecord value5(Long value) {
        setReturndate(value);
        return this;
    }

    @Override
    public VideoRecord values(String value1, String value2, String value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VideoRecord
     */
    public VideoRecord() {
        super(Video.VIDEO);
    }

    /**
     * Create a detached, initialised VideoRecord
     */
    public VideoRecord(String id, String name, String type, Long outdate, Long returndate) {
        super(Video.VIDEO);

        setId(id);
        setName(name);
        setType(type);
        setOutdate(outdate);
        setReturndate(returndate);
    }
}
