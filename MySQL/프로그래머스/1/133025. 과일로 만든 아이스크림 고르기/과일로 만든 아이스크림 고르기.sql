-- 코드를 입력하세요
SELECT A.FLAVOR AS FLAVOR
    FROM FIRST_HALF AS A
    JOIN ICECREAM_INFO AS B ON A.FLAVOR = B.FLAVOR
    WHERE TOTAL_ORDER > 3000
    AND INGREDIENT_TYPE = 'fruit_based'
    ORDER BY TOTAL_ORDER DESC;