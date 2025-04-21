# Proyecto de Desarrollo de Ecosistema de IA para Sensores de IPICYT.

Este proyecto, consiste en un desarrollo para el Diplomado de Ciencia y Tecnología en Inteligencia Artificial del IPICYT.

# Railway:
https://railway.com/project/b0a02c62-e422-4e1e-b340-f91df3001a9a?environmentId=ba03676a-aa57-425d-8d88-781dbdc4b8b3

#Endpoints:

GET:
https://ipicyt-ia-gateway-production.up.railway.app/mediciones

POST:
{
  "valor": "998.45"
}

Index:
https://ipicyt-ia-gateway-production.up.railway.app/mediciones/hello



Objeto del sensor:
{
  "time": "2025-04-21T04:45:18.015654971+00:00",
  "deviceInfo": {
    "tenantId": "52f14cd4-c6f1-4fbd-8f87-4025e1d49242",
    "tenantName": "IPICyT",
    "applicationId": "11744b65-5428-4ad2-b6df-03b13e547296",
    "applicationName": "Co_2",
    "deviceProfileId": "38607b09-4782-4b75-99d1-998b564ed43d",
    "deviceProfileName": "Co_2",
    "deviceName": "Sensor_1",
    "devEui": "2cf7f1c16100001a",
    "deviceClassEnabled": "CLASS_C",
    "tags": {}
  },
  "level": "ERROR",
  "code": "UPLINK_CODEC",
  "description": "JS error: Error: decodeUplink is not defined\n    at <eval> (eval_script:42:1)\n",
  "context": {
    "deduplication_id": "12f6d36d-7860-4dca-bcf0-297ad1a6db39"
  }
}


