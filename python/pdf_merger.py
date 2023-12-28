import PyPDF2

def create(input,output,pages):
    pdf_writer=PyPDF2.PdfWriter()
    for pdf_path,page_num in pages.items():
        with open(pdf_path,'rb')as pdf_file:
            pdf_reader=PyPDF2.PdfReader(pdf_file)
            for page in page_num:
                pdf_writer.add_page(pdf_reader.pages[page_num-1])
    with open(output,'wb')as output_file:
        pdf_writer.write(output_file)
if __name__=="__main__":
    input={"C:/Users/Rana Yuvi/Downloads/MODULE-4-Dynamic programming-Notes.pdf","C:/Users/Rana Yuvi/Downloads/Module 2 Decrease and conquer.pdf"}
    output='combined.pdf'
    pages={"C:/Users/Rana Yuvi/Downloads/MODULE-4-Dynamic programming-Notes.pdf":[1,2,3],"C:/Users/Rana Yuvi/Downloads/Module 2 Decrease and conquer.pdf":[4,5] }
    create(input,output,pages)
    print("PDF merged Successfully")