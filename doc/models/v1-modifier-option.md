
# V1 Modifier Option

V1ModifierOption

## Structure

`V1ModifierOption`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The modifier option's unique ID. | String getId() |
| `Name` | `String` | Optional | The modifier option's name. | String getName() |
| `PriceMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - | V1Money getPriceMoney() |
| `OnByDefault` | `Boolean` | Optional | If true, the modifier option is the default option in a modifier list for which selection_type is SINGLE. | Boolean getOnByDefault() |
| `Ordinal` | `Integer` | Optional | Indicates the modifier option's list position when displayed in Square Point of Sale and the merchant dashboard. If more than one modifier option in the same modifier list has the same ordinal value, those options are displayed in alphabetical order. | Integer getOrdinal() |
| `ModifierListId` | `String` | Optional | The ID of the modifier list the option belongs to. | String getModifierListId() |
| `V2Id` | `String` | Optional | The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID. | String getV2Id() |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": "name0",
  "price_money": {
    "amount": 202,
    "currency_code": "XBB"
  },
  "on_by_default": false,
  "ordinal": 80
}
```

