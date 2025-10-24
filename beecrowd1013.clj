(require '[clojure.string :as str])

(let [line (read-line)
      values (str/split line #"\s+")
      [a b c] (map #(Integer/parseInt %) values)
      larger (/ (+ a b (Math/abs (- a b))) 2)]

  (if (> larger c)
    (println (format "%d eh o maior" larger))
    (println (format "%d eh o maior" c))))