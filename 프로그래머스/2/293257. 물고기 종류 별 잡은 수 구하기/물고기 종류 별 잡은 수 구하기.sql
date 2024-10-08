SELECT COUNT(B.FISH_NAME) AS FISH_COUNT, B.FISH_NAME
FROM FISH_INFO AS A LEFT JOIN FISH_NAME_INFO AS B
ON A.FISH_TYPE = B.FISH_TYPE
GROUP BY FISH_NAME
ORDER BY COUNT(A.FISH_TYPE) DESC;