(let [commissionPercent 15
      name (read-line)
      salary (Double/parseDouble (read-line))
      salesInMonth (Double/parseDouble (read-line))

      commission (/ (* salesInMonth commissionPercent) 100)
      salaryWithCommission (+ salary commission)]

  (println (format "TOTAL = R$ %.2f" salaryWithCommission)))