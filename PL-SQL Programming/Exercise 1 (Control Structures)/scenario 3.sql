DECLARE
BEGIN
    FOR rec IN (
        SELECT c.Name,
               l.DueDate
        FROM CUSTOMERS c
        JOIN LOANS l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: ' || rec.Name ||
            ' loan due on ' ||
            TO_CHAR(rec.DueDate,'YYYY-MM-DD')
        );
    END LOOP;
END;
/