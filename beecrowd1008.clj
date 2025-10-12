(let [employee-number (Integer/parseInt (read-line))
      worked-hours (Integer/parseInt (read-line))
      value-per-hour (Double/parseDouble (read-line))]

  (println (format "NUMBER = %d" employee-number))
  (println (format "SALARY = U$ %.2f" (* worked-hours value-per-hour))))