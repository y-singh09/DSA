import zipfile
import os
def create_zip(folder_path, zip_name):
    with zipfile.ZipFile(zip_name, 'w', zipfile.ZIP_DEFLATED) as zipf:
        for root, dirs, files in os.walk(folder_path):
            for file in files:
                file_path = os.path.join(root, file)
                zipf.write(file_path, os.path.relpath(file_path, folder_path))
# Example usage
folder_path = "C:/Users/Rana Yuvi/OneDrive/Documents/python/yuvi"
zip_name ="yuvizip.zip"
create_zip(folder_path,zip_name)
print("Zip file Created Successfully")
