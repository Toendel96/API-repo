
# ErrorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statusCode** | **String** | Error code (determined on this API service): Any Errorcode important enough to need handling by consumer should be promotoed to a specific status code value and shown in this field.  | 
**message** | **String** | Readable message associated with statuscode. | 
**backendInfo** | [**List&lt;BackendResponse&gt;**](BackendResponse.md) | Error responses from backend systems. This data is optional and can not be considered as always present. Any errors that need custom handling should be promotoed to the required statusCode field  |  [optional]



