
import json

def fetch_weather_data(json_file_path):
    with open(json_file_path, 'r') as json_file:
        weather_data = json.load(json_file)
        return weather_data

if __name__ == "__main__":
    json_file_path = 'weather_data.json'
    
    try:
        weather_data = fetch_weather_data(json_file_path)
        print("City:", weather_data['city'])
        print("Temperature:", weather_data['temperature'], "°F")
        print("Weather Condition:", weather_data['weather_condition'])
    except FileNotFoundError:
        print(f"Error: File '{json_file_path}' not found.")
    except KeyError:
        print("Error: Invalid JSON format or missing key in the file.")
