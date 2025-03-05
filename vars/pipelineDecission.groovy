#!groovy

def decidePipeline(Map configMap) {

    def type = configMap.get("type")
    switch(type) {
        case "nodejsEKS":
            nodejsEKS(configMap)
            break
        case "nodejsVM":
            nodejsVM(configMap)
            break
        default:
            error "type is not matched" 
            break
    }
}