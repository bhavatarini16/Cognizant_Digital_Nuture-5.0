DECLARE
BEGIN
    UPDATE LOANS
    SET InterestRate = InterestRate - 1
    WHERE CustomerID IN (
        SELECT CustomerID
        FROM CUSTOMERS
        WHERE Age > 60
    );

    DBMS_OUTPUT.PUT_LINE('Discount applied');

    COMMIT;
END;
/