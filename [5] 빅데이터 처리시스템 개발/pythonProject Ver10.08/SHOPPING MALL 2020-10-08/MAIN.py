import Login
import MemberManagement
import MemberJoin
import pymysql
from tkinter import *
from tkinter import messagebox

##==============    Function   =============
##  Login
def loginBTN():
    global conn, cur
    global email,password

    conn = pymysql.connect(host=HOST, user=USER, password=PASSWORD,db=DB, charset="utf8")
    cur = conn.cursor()  # 빈 트럭 준비
    cur.execute("SELECT * FROM member")
    temp =''
    while (True) :
        row = cur.fetchone()
        if row == None :
            break;
        email     = row[0]
        password  = row[1]
        print(inputEmail.get(), inputPassword.get() , email, password)

        if inputEmail.get() == email and inputPassword.get() == password :
            print('Success')
            memerManagementBTN()
        elif inputEmail.get() == email and inputPassword.get() != password :
            temp = 'Password Error'
        else :
            print('Error')
            temp = TRUE

    if temp == 'Password Error' :
        messagebox.showerror('Error','비밀번호가 맞지 않습니다.')
    if temp == TRUE :
        messagebox.showerror('Error','없는 아이디 입니다.')

##  Member Management
def memerManagementBTN() :
    window.destroy()
    MemberManagement.memberManagement()

def memerJoinBTN() :
    MemberJoin.memberManagement()

##=============  Global variable   ==========
conn, cur = None, None
HOST = "127.0.0.1"
USER ="root"
PASSWORD ="1234"
DB = "shopping_mall"

email,password = '',''
##==============    MAIN CODE   =============

# if __name__ == '__main__' :
window = Tk()
window.title('SHOPPING MALL PROJECT')
window.geometry('200x300')
edtFrame = Frame(window);
edtFrame.pack();
listFrame = Frame(window)
listFrame.pack(side = BOTTOM, fill=BOTH, expand=1)
#   Input Email
inputEmail = Entry(edtFrame, width = 10);  inputEmail.pack(padx=10, pady=10)
#   Input Password
inputPassword = Entry(edtFrame, width = 10);  inputPassword.pack(padx=10, pady=10)

#Login Button
edt = Entry(window, width = 10)
loginbtn = Button(window, text='로그인', width=10, command=loginBTN)
loginbtn.pack(padx=10, pady=10)
memerManagement = Button(window, text='회원가입', width=10, command=memerJoinBTN)
memerManagement.pack(padx=10, pady=10)
memerManagement = Button(window, text='회원관리', width=10, command=memerManagementBTN)
memerManagement.pack(padx=10, pady=10)
window.mainloop()
