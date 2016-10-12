(ns picture-gallery.config
  (:require [cprop.core :refer [load-config]]
            [cprop.source :as source]
            [mount.core :refer [args defstate]]))

(defstate env :start (load-config
                       :merge
                       [(:options (args))
                        (source/from-system-props)
                        (source/from-env)]))
