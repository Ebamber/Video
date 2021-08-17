/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.public_.tables;


import java.util.Arrays;
import java.util.List;

import org.github.ebamber.Video.generated.db.public_.Keys;
import org.github.ebamber.Video.generated.db.public_.Public;
import org.github.ebamber.Video.generated.db.public_.tables.records.VideoRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Video extends TableImpl<VideoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.VIDEO</code>
     */
    public static final Video VIDEO = new Video();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VideoRecord> getRecordType() {
        return VideoRecord.class;
    }

    /**
     * The column <code>PUBLIC.VIDEO.ID</code>.
     */
    public final TableField<VideoRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.VIDEO.NAME</code>.
     */
    public final TableField<VideoRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.VIDEO.TYPE</code>.
     */
    public final TableField<VideoRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.VIDEO.OUTDATE</code>.
     */
    public final TableField<VideoRecord, Long> OUTDATE = createField(DSL.name("OUTDATE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.VIDEO.RETURNDATE</code>.
     */
    public final TableField<VideoRecord, Long> RETURNDATE = createField(DSL.name("RETURNDATE"), SQLDataType.BIGINT, this, "");

    private Video(Name alias, Table<VideoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Video(Name alias, Table<VideoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.VIDEO</code> table reference
     */
    public Video(String alias) {
        this(DSL.name(alias), VIDEO);
    }

    /**
     * Create an aliased <code>PUBLIC.VIDEO</code> table reference
     */
    public Video(Name alias) {
        this(alias, VIDEO);
    }

    /**
     * Create a <code>PUBLIC.VIDEO</code> table reference
     */
    public Video() {
        this(DSL.name("VIDEO"), null);
    }

    public <O extends Record> Video(Table<O> child, ForeignKey<O, VideoRecord> key) {
        super(child, key, VIDEO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<VideoRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<UniqueKey<VideoRecord>> getKeys() {
        return Arrays.<UniqueKey<VideoRecord>>asList(Keys.CONSTRAINT_4);
    }

    @Override
    public Video as(String alias) {
        return new Video(DSL.name(alias), this);
    }

    @Override
    public Video as(Name alias) {
        return new Video(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Video rename(String name) {
        return new Video(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Video rename(Name name) {
        return new Video(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
