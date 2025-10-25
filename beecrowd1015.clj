(require '[clojure.string :as str])

(defn parse-line [line]
  (let [[sx sy] (str/split line #"\s+")]
    [(Double/parseDouble sx) (Double/parseDouble sy)]))

(let [[line1 line2] (repeatedly 2 read-line)
      [x1 y1] (parse-line line1)
      [x2 y2] (parse-line line2)
      dx (- x2 x1)
      dy (- y2 y1)
      distance (Math/sqrt (+ (Math/pow dx 2) (Math/pow dy 2)))]
  (println (format "%.4f" distance)))