(def kml 12.0)

(let [hours (Integer/parseInt (read-line))
      speed (Integer/parseInt (read-line))
      distance (* speed hours)
      result (/ distance kml)]

  (println (format "%.3f" result)))