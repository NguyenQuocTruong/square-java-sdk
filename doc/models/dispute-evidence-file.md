
# Dispute Evidence File

A file to be uploaded as dispute evidence.

## Structure

`DisputeEvidenceFile`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Filename` | `String` | Optional | The file name including the file extension. For example: "receipt.tiff". | String getFilename() |
| `Filetype` | `String` | Optional | Dispute evidence files must be application/pdf, image/heic, image/heif, image/jpeg, image/png, or image/tiff formats. | String getFiletype() |

## Example (as JSON)

```json
{
  "filename": "filename2",
  "filetype": "filetype2"
}
```

