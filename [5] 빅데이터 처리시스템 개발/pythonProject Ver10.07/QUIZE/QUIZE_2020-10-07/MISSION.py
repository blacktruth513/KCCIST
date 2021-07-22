import pymysql
from tkinter import *
from tkinter import messagebox

##  함수 선언부
def insertData() :
    pass

def selectData() :
    pass


##  MainCode
window = Tk()
window.title('GUI 데이터 입력')
window.geometry('600x300')

edtFrame = Frame(window);
edtFrame.pack();
listFrame = Frame(window)
listFrame.pack(side = BOTTOM, fill=BOTH, expand=1)

edt1 = Entry(edtFrame, width=10);   edt1.pack(side=LEFT, padx=10, pady=10)
edt2 = Entry(edtFrame, width=10);   edt2.pack(side=LEFT, padx=10, pady=10)
edt3 = Entry(edtFrame, width=10);   edt3.pack(side=LEFT, padx=10, pady=10)
edt4 = Entry(edtFrame, width=10);   edt4.pack(side=LEFT, padx=10, pady=10)

btnInsert = Button(edtFrame, text="입력",command=insertData())
btnInsert.pack(side=LEFT,padx=10,pady=10)
btnInsert = Button(edtFrame, text="조회",command=insertData())
btnInsert.pack(side=LEFT,padx=10,pady=10)

listData1 = Listbox(listFrame, bg = 'yellow')
listData1.pack(side=LEFT, fill=BOTH, expand=1)
listData2 = Listbox(listFrame, bg = 'yellow')
listData2.pack(side=LEFT, fill=BOTH, expand=1)
listData3 = Listbox(listFrame, bg = 'yellow')
listData3.pack(side=LEFT, fill=BOTH, expand=1)
listData4 = Listbox(listFrame, bg = 'yellow')
listData4.pack(side=LEFT, fill=BOTH, expand=1)

window.mainloop()
