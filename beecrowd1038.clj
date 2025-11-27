(require '[clojure.string :as str])

(def items {1 4.00
            2 4.50
            3 5.00
            4 2.00
            5 1.50})

(let [[code quantity] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
      itemUnitaryValue (get items code)
      total (* itemUnitaryValue quantity)]
  (println (format "Total: R$ %.2f" total)))