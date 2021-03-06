(ns config.environment)

(def properties
  (atom 
    { :assets-dir "public"
      :javascripts-dir "javascripts"
      :stylesheets-dir "stylesheets"
      :images-dir "images"

      :jquery "jquery-1.3.2.min.js"
      :conjure-js "conjure.js"

      :use-logger? true

      :call-service-fn (fn []
                         (require 'conjure.flow.util)
                         ((ns-resolve 'conjure.flow.util 'call-flow))) }))