(ns example.core
  (:require [eye-boof.core :refer :all]
            [eye-boof.visualization :refer [show-image]]))

(def color-img (-> "https://geokon-gh.github.io/web/chengdu.jpg"
                   (java.net.URL.)
                   (load-image->planar-u8)))

(show-image color-img)

color-img
