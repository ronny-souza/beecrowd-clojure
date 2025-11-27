(require '[clojure.string :as str])

(let [values (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
      sorted-values (sort values)]
  (doseq [sv sorted-values]
    (println sv))

  (println)
  (doseq [v values]
    (println v)))