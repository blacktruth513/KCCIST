'''
** 12일차 (빅데이터 처리 시스템 개발)**
# 복습퀴즈
(1) 데이터베이스 및 테이블 설계
 - 쇼핑몰 중 한곳을 골라서 회원가입 양식을 확인하고 [회원 테이블]을 만든다.
 - 적당한 물건을 장바구니에 담은 후에, [구매] 버튼을 눌러서 확인하고 [구매 테이블]을 만든다.
 - 데이터를 회원 2명, 구매물건 각 3건씩 입력한다.


(2) 위 1번의 회원가입을 위한 TUI(Text User Interface) Python 코드를 작성한다.
(3) 위 1번의 회원가입을 위한 GUI Python 코드를 작성한다.
'''
import pymysql
from tkinter import *
from tkinter import messagebox
def memberManagement():

    ##====================================================================================
    ##  함수 선언부
    
    ##      Data삽입 함수
    def insertMemberData() :
        global conn, cur
        print("insertMemberData(입력 버튼 클릭)")
    
        conn, cur = None, None # 교량과 트럭
        data1, data2, data3, data4 = "", "", "", ""
        data5 = ""
        sql = ""
        conn = pymysql.connect(host=HOST, user=USER, password=PASSWORD,db=DB, charset="utf8")
        cur = conn.cursor()  # 빈 트럭 준비
    
        data1 = edt1.get();
        data2 = edt2.get();
        data3 = edt3.get();
        data4 = edt4.get();
        data5 = edt5.get();
    
        '''
        m_email	VARCHAR(30) 	PRIMARY KEY,	#회원 이메일
        m_pw		VARCHAR(50)		NOT NULL,		#회원 비밀번호
        m_name	VARCHAR(25) 	NOT NULL,		#이름
        s_tel		INT				NULL,				#연락처
        order_num INT				NULL				#주문번호
        '''
    
        try :
            sql = "INSERT INTO member (m_email,m_pw,m_name,s_tel)"
            sql += "VALUES('"+data1+"','"+data2+"','"+data3 +"',"+data4+")"
            # sql = "INSERT INTO student VALUES("+data1+",'"+data2+"','"+data3+"','"+data4 +"')"
            print(sql)
            cur.execute(sql)
        except :
            messagebox.showerror('오류', '데이터 입력 오류 발생')
        else :
            messagebox.showinfo('성공' , '데이터 입력 성공')
    
        conn.commit()
        conn.close()
        window.destroy()

    ##====================================================================================
    ## 전역변수부
    conn, cur = None, None
    HOST = "127.0.0.1"
    USER ="root"
    PASSWORD ="1234"
    DB = "shopping_mall"
    ##====================================================================================
    
    ##  MainCode
    window = Tk()
    window.title('shopping_mall')
    window.geometry('800x300')
    
    edtFrame = Frame(window);
    edtFrame.pack();
    listFrame = Frame(window)
    listFrame.pack(side = BOTTOM, fill=BOTH, expand=1)
    
    edt1 = Entry(edtFrame, width=10);   edt1.pack(side=LEFT, padx=10, pady=10)
    edt2 = Entry(edtFrame, width=10);   edt2.pack(side=LEFT, padx=10, pady=10)
    edt3 = Entry(edtFrame, width=10);   edt3.pack(side=LEFT, padx=10, pady=10)
    edt4 = Entry(edtFrame, width=10);   edt4.pack(side=LEFT, padx=10, pady=10)
    edt5 = Entry(edtFrame, width=10);   edt5.pack(side=LEFT, padx=10, pady=10)
    
    ## BUTTON
    btnInsert = Button(edtFrame, text="회원가입",command=insertMemberData)
    btnInsert.pack(side=LEFT,padx=10,pady=10)

    # btnSelect = Button(edtFrame, text="회원조회",command=selectMemberData)
    # btnSelect.pack(side=LEFT,padx=10,pady=10)
    
    # listData1 = Listbox(listFrame, bg = 'white')
    # listData1.pack(side=LEFT, fill=BOTH, expand=1)
    #
    # listData2 = Listbox(listFrame, bg = 'white')
    # listData2.pack(side=LEFT, fill=BOTH, expand=1)
    #
    # listData3 = Listbox(listFrame, bg = 'white')
    # listData3.pack(side=LEFT, fill=BOTH, expand=1)
    #
    # listData4 = Listbox(listFrame, bg = 'white')
    # listData4.pack(side=LEFT, fill=BOTH, expand=1)
    
    # listData5 = Listbox(listFrame, bg = 'white')
    # listData5.pack(side=LEFT, fill=BOTH, expand=1)
    
    window.mainloop()
