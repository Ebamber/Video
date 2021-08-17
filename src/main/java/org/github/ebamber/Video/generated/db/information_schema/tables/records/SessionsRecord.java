/*
 * This file is generated by jOOQ.
 */
package org.github.ebamber.Video.generated.db.information_schema.tables.records;


import java.time.OffsetDateTime;

import org.github.ebamber.Video.generated.db.information_schema.tables.Sessions;
import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionsRecord extends TableRecordImpl<SessionsRecord> implements Record12<Integer, String, String, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.SERVER</code>.
     */
    public void setServer(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.SERVER</code>.
     */
    public String getServer() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_ADDR</code>.
     */
    public void setClientAddr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_ADDR</code>.
     */
    public String getClientAddr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_INFO</code>.
     */
    public void setClientInfo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_INFO</code>.
     */
    public String getClientInfo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
     */
    public void setSessionStart(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
     */
    public OffsetDateTime getSessionStart() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.ISOLATION_LEVEL</code>.
     */
    public void setIsolationLevel(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.ISOLATION_LEVEL</code>.
     */
    public String getIsolationLevel() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
     */
    public void setStatement(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
     */
    public String getStatement() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
     */
    public void setStatementStart(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
     */
    public OffsetDateTime getStatementStart() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
     */
    public void setContainsUncommitted(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
     */
    public Boolean getContainsUncommitted() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.STATE</code>.
     */
    public void setState(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.STATE</code>.
     */
    public String getState() {
        return (String) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSIONS.BLOCKER_ID</code>.
     */
    public void setBlockerId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSIONS.BLOCKER_ID</code>.
     */
    public Integer getBlockerId() {
        return (Integer) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Sessions.SESSIONS.ID;
    }

    @Override
    public Field<String> field2() {
        return Sessions.SESSIONS.USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return Sessions.SESSIONS.SERVER;
    }

    @Override
    public Field<String> field4() {
        return Sessions.SESSIONS.CLIENT_ADDR;
    }

    @Override
    public Field<String> field5() {
        return Sessions.SESSIONS.CLIENT_INFO;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Sessions.SESSIONS.SESSION_START;
    }

    @Override
    public Field<String> field7() {
        return Sessions.SESSIONS.ISOLATION_LEVEL;
    }

    @Override
    public Field<String> field8() {
        return Sessions.SESSIONS.STATEMENT;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return Sessions.SESSIONS.STATEMENT_START;
    }

    @Override
    public Field<Boolean> field10() {
        return Sessions.SESSIONS.CONTAINS_UNCOMMITTED;
    }

    @Override
    public Field<String> field11() {
        return Sessions.SESSIONS.STATE;
    }

    @Override
    public Field<Integer> field12() {
        return Sessions.SESSIONS.BLOCKER_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserName();
    }

    @Override
    public String component3() {
        return getServer();
    }

    @Override
    public String component4() {
        return getClientAddr();
    }

    @Override
    public String component5() {
        return getClientInfo();
    }

    @Override
    public OffsetDateTime component6() {
        return getSessionStart();
    }

    @Override
    public String component7() {
        return getIsolationLevel();
    }

    @Override
    public String component8() {
        return getStatement();
    }

    @Override
    public OffsetDateTime component9() {
        return getStatementStart();
    }

    @Override
    public Boolean component10() {
        return getContainsUncommitted();
    }

    @Override
    public String component11() {
        return getState();
    }

    @Override
    public Integer component12() {
        return getBlockerId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserName();
    }

    @Override
    public String value3() {
        return getServer();
    }

    @Override
    public String value4() {
        return getClientAddr();
    }

    @Override
    public String value5() {
        return getClientInfo();
    }

    @Override
    public OffsetDateTime value6() {
        return getSessionStart();
    }

    @Override
    public String value7() {
        return getIsolationLevel();
    }

    @Override
    public String value8() {
        return getStatement();
    }

    @Override
    public OffsetDateTime value9() {
        return getStatementStart();
    }

    @Override
    public Boolean value10() {
        return getContainsUncommitted();
    }

    @Override
    public String value11() {
        return getState();
    }

    @Override
    public Integer value12() {
        return getBlockerId();
    }

    @Override
    public SessionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SessionsRecord value2(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public SessionsRecord value3(String value) {
        setServer(value);
        return this;
    }

    @Override
    public SessionsRecord value4(String value) {
        setClientAddr(value);
        return this;
    }

    @Override
    public SessionsRecord value5(String value) {
        setClientInfo(value);
        return this;
    }

    @Override
    public SessionsRecord value6(OffsetDateTime value) {
        setSessionStart(value);
        return this;
    }

    @Override
    public SessionsRecord value7(String value) {
        setIsolationLevel(value);
        return this;
    }

    @Override
    public SessionsRecord value8(String value) {
        setStatement(value);
        return this;
    }

    @Override
    public SessionsRecord value9(OffsetDateTime value) {
        setStatementStart(value);
        return this;
    }

    @Override
    public SessionsRecord value10(Boolean value) {
        setContainsUncommitted(value);
        return this;
    }

    @Override
    public SessionsRecord value11(String value) {
        setState(value);
        return this;
    }

    @Override
    public SessionsRecord value12(Integer value) {
        setBlockerId(value);
        return this;
    }

    @Override
    public SessionsRecord values(Integer value1, String value2, String value3, String value4, String value5, OffsetDateTime value6, String value7, String value8, OffsetDateTime value9, Boolean value10, String value11, Integer value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionsRecord
     */
    public SessionsRecord() {
        super(Sessions.SESSIONS);
    }

    /**
     * Create a detached, initialised SessionsRecord
     */
    public SessionsRecord(Integer id, String userName, String server, String clientAddr, String clientInfo, OffsetDateTime sessionStart, String isolationLevel, String statement, OffsetDateTime statementStart, Boolean containsUncommitted, String state, Integer blockerId) {
        super(Sessions.SESSIONS);

        setId(id);
        setUserName(userName);
        setServer(server);
        setClientAddr(clientAddr);
        setClientInfo(clientInfo);
        setSessionStart(sessionStart);
        setIsolationLevel(isolationLevel);
        setStatement(statement);
        setStatementStart(statementStart);
        setContainsUncommitted(containsUncommitted);
        setState(state);
        setBlockerId(blockerId);
    }
}
