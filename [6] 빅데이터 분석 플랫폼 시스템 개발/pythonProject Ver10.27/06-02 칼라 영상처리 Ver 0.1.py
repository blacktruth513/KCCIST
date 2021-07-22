from tkinter import *
from tkinter.filedialog import *
from tkinter.simpledialog import *
import math
#cd2 외부 라이브러리 설치 필요
#cmd > pip install opencv-python
import cv2
import numpy
import numpy as np
## 함수선언부
def malloc(h, w, value=0) :
    global count
    count +=1;
    print('Run malloc() Method ...',h,w,value,count)

    if count >= 3 :
        count = 0;

    retMemory = [ [ value for _ in range(w)]  for _ in range(h) ]
    return retMemory

def openFile() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run openFile() Method ...')
    ## 파일 선택하기
    filename = askopenfilename(parent=window, filetypes=(('Color 파일', '*.jpg;*.png;*.bmp;*.tif'), ('All File', '*.*')))

    ## (중요!) 입력이미지의 높이와 폭 알아내기

    # fsize = os.path.getsize(filename)
    # inH = inW = int(math.sqrt(fsize))
    cvInImage = cv2.imread(filename)
    print(cvInImage.shape)
    inH = cvInImage.shape[0]
    inW = cvInImage.shape[1]

    ## 입력이미지용 메모리 할당
    inImage = []
    for _ in range(RGB): #칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        inImage.append(malloc(inH, inW))

    ## 파일 --> 메모리 로딩
    #cv는 한 픽셀값에 rgb값이 들어있어 3차원배열이 아닌 2차원배열로 만들어야한다.
    # with open(filename,'rb') as fp :
    # for rgb in range(RGB) :

    for i in range(inH):
        for k in range(inW):
            inImage[R][i][k] = cvInImage.item(i, k, B)
            inImage[G][i][k] = cvInImage.item(i, k, G)
            inImage[B][i][k] = cvInImage.item(i, k, R)
    equalColor()

def saveFile() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    if filename == None or filename == '' :
        return

    saveCvPhoto = np.zeros((outH, outW, 3), np.uint8)

    for i in range(outH) :
        for k in range(outW) :
            tup = tuple(([outImage[B][i][k],outImage[G][i][k],outImage[R][i][k]]))
            saveCvPhoto[i,k] = tup

    saveFp = asksaveasfile(parent=window, mode='wb',defaultextension='.', filetypes=(("그림 파일", "*.png;*.jpg;*.bmp;*.tif"), ("모든 파일", "*.*")))

    if saveFp == '' or saveFp == None:
        return
    cv2.imwrite(saveFp.name, saveCvPhoto)

def displayImageColor() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run displayImageColor() Method ...')

    # canvas의 크기에 따라 윈도우의 크기 변환 > 없어도 자동적으로 변환된다.
    window.geometry(str(outH) + 'x' + str(outW))
    if canvas != None:
        canvas.destroy()
    canvas = Canvas(window, height=outH, width=outW)
    paper = PhotoImage(height=outH, width=outW)

    canvas.create_image((outH / 2, outW / 2), image=paper, state='normal')

    # 메모리에서 처리한 후, 한방에 화면에 보이기 --> 완전 빠름
    rgbString = ""
    for i in range(outH):
        tmpString = ""  # 각 줄
        for k in range(outW):
            r = outImage[R][i][k]
            g = outImage[G][i][k]
            b = outImage[B][i][k]
            tmpString += "#%02x%02x%02x " % (r, g, b)
        rgbString += '{' + tmpString + '} '
    paper.put(rgbString)
    canvas.pack()
#====================================== 영상처리 함수 ======================================
def equalColor() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run equalColor() Method ...')

    if filename == '' or filename == None :
        return

    ## 알고리즘에 의해 출력이미지의 높이,폭이 결정된다.
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        outImage.append(malloc(inH, inW));

    ### 진짜 영상처리 알고리즘 ###
    for rgb in range(RGB) :
        for i in range(inH):
            for k in range(inW):
                outImage[rgb][i][k] = inImage[rgb][i][k]

    ########################
    displayImageColor()

def addColor() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    if filename == '' or filename == None:
        return

    ## (중요!) 출력이미지의 높이, 폭을 결정 ---> 알고리즘에 의존
    outH = inH;    outW = inW

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB) :
        outImage.append(malloc(outH, outW))

    ### 진짜 영상처리 알고리즘 ###
    value = askinteger("밝게하기", "값")
    for rgb in range(RGB):
        for i in range(inH):
            for k in range(inW):
                out = inImage[rgb][i][k] + value
                if out > 255 :
                    outImage[rgb][i][k] = 255
                else :
                    outImage[rgb][i][k] = out

    ########################
    displayImageColor()

def grayColor() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    if filename == '' or filename == None:
        return

    ## (중요!) 출력이미지의 높이, 폭을 결정 ---> 알고리즘에 의존
    outH = inH;    outW = inW

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB) :
        outImage.append(malloc(outH, outW))

    ### 진짜 영상처리 알고리즘 ###
    for i in range(inH):
        for k in range(inW):
            c = inImage[R][i][k] + inImage[G][i][k] + inImage[B][i][k]
            c = int(c/3)
            outImage[R][i][k] = outImage[G][i][k] = outImage[B][i][k] = c
    ########################
    displayImageColor()

def gammaColor() :  # 감마
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    if filename == '' or filename == None :
        return

    ## (중요!) 출력이미지의 높이, 폭을 결정 ---> 알고리즘에 의존
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):
        outImage.append(malloc(outH, outW))

    ### 진짜 영상처리 알고리즘 ###
    ### Out = I ** (1/r)

    r = askfloat("감마연산", "값[0.8~1.2]-->", )
    for rgb in range(RGB):
        for i in range(inH):
            for k in range(inW):
                # outImage[rgb][i][k] = inImage[rgb][i][k]

                v = int(inImage[rgb][i][k] ** (1 / r));
                print(rgb, i, k, v,'<<',inImage[rgb][i][k])
                if v > 255:
                    outImage[rgb][i][k] = 255;
                elif v < 0:
                    outImage[rgb][i][k] = 0;
                else:
                    outImage[rgb][i][k] = int(inImage[rgb][i][k] ** (1 / r));
    ########################
    displayImageColor()

def paraCapColor() :  # 파라볼라 캡
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    if filename == '' or filename == None :
        return

    ## (중요!) 출력이미지의 높이, 폭을 결정 ---> 알고리즘에 의존
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):
        outImage.append(malloc(outH, outW))

    ### 진짜 영상처리 알고리즘 ###
    ### Out = 255.0*(inImage/128.0-1.0) ** 2
    for rgb in range(RGB):
        for i in range(inH) :
            for k in range(inW) :
                v = 255.0*((inImage[rgb][i][k]/128.0-1.0) ** 2);
                if v > 255 :
                    outImage[rgb][i][k] = 255;
                elif v < 0 :
                    outImage[rgb][i][k] = 0;
                else :
                    outImage[rgb][i][k] = int(v);
    ########################
    displayImageColor()

def paraCupColor() :  # 파라볼라 컵 알고리즘
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    if filename == '' or filename == None :
        return

    ## (중요!) 출력이미지의 높이, 폭을 결정 ---> 알고리즘에 의존
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):
        outImage.append(malloc(outH, outW))

    ### 진짜 영상처리 알고리즘 ###
    ### Out = 255.0*(inImage/128.0-1.0) ** 2
    for rgb in range(RGB):
        for i in range(inH) :
            for k in range(inW) :
                v = 255-255.0*((inImage[rgb][i][k]/128.0-1.0) ** 2);
                if v > 255 :
                    outImage[rgb][i][k] = 255;
                elif v < 0 :
                    outImage[rgb][i][k] = 0;
                else :
                    outImage[rgb][i][k] = int(v);
    ########################
    displayImageColor()

def bw1Color() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run equalColor() Method ...')

    if filename == '' or filename == None :
        return

    ## 알고리즘에 의해 출력이미지의 높이,폭이 결정된다.
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        outImage.append(malloc(inH, inW));

    ### 진짜 영상처리 알고리즘 ###
    for rgb in range(RGB) :
        for i in range(inH):
            for k in range(inW):
                if inImage[rgb][i][k] < 127:
                    outImage[rgb][i][k] = 0
                else:
                    outImage[rgb][i][k] = 255
    ########################
    displayImageColor()

def bw2Color() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run equalColor() Method ...')

    if filename == '' or filename == None :
        return

    ## 알고리즘에 의해 출력이미지의 높이,폭이 결정된다.
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        outImage.append(malloc(inH, inW));

    ### 이진화(평균) 알고리즘 ###
    sum = 0;
    for rgb in range(RGB):
        for i in range(inH):
            for k in range(inW):
                sum += inImage[rgb][i][k];
    avg = sum/(rgb*inH*inW)

    for rgb in range(RGB) :
        for i in range(inH):
            for k in range(inW):
                if inImage[rgb][i][k] < avg:
                    outImage[rgb][i][k] = 0
                else:
                    outImage[rgb][i][k] = 255
    ########################
    displayImageColor()

def bw3Color() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run equalColor() Method ...')

    if filename == '' or filename == None :
        return

    ## 알고리즘에 의해 출력이미지의 높이,폭이 결정된다.
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        outImage.append(malloc(inH, inW));

    ### 이진화(중위수) 알고리즘 ###
    tmpArray = []
    sum = 0;
    for rgb in range(RGB):
        for i in range(inH):
            for k in range(inW):
                tmpArray.append(inImage[rgb][i][k])

    tmpArray.sort()
    mid = tmpArray[int((RGB*inH*inW)/2)]

    for rgb in range(RGB) :
        for i in range(inH):
            for k in range(inW):
                if inImage[rgb][i][k] < mid:
                    outImage[rgb][i][k] = 0
                else:
                    outImage[rgb][i][k] = 255
    ########################
    displayImageColor()

def sharpColor() :
    global window, canvas, paper, inImage, outImage, inH, inW, outH, outW, filename
    global cvInImage, cvOutImage
    print('Run sharpColor() Method ...')

    if filename == '' or filename == None :
        return

    ## 알고리즘에 의해 출력이미지의 높이,폭이 결정된다.
    outH = inH;
    outW = inW;

    ## 출력이미지 메모리 할당
    outImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        outImage.append(malloc(inH, inW));

    ### 진짜 영상처리 알고리즘 ###

    mSize = 3
    mask = [
                [
                    [0.0, -1.0, 0.0],
                    [-1.0, 5.0, -1.0],
                    [0.0, -1.0, 0.0]
                ],
                [
                    [0.0, -1.0, 0.0],
                    [-1.0, 5.0, -1.0],
                    [0.0, -1.0, 0.0]
                ],
                [
                    [0.0, -1.0, 0.0],
                    [-1.0, 5.0, -1.0],
                    [0.0, -1.0, 0.0]
                ]
            ]

    tmpInImage = []
    for _ in range(RGB):  # 칼라는 r,g,b로 3개이지만 이런경우 전역상수로 만들어주는게 좋다.
        tmpInImage.append(malloc(inH + 2, inW + 2, 127))
    tmpOutImage = []
    for _ in range(RGB):
        tmpOutImage.append(malloc(outH, outW))
    # inImage --> 임시input
    # for rgb in range(RGB) :
    #     for i in range(inH):
    #         for k in range(inW):
    #             outImage[rgb][i][k] = inImage[rgb][i][k]
    for rgb in range(RGB):
        for i in range(inH):
            for k in range(inW):
                # print(inImage[rgb][i][k],'>>>',float(inImage[rgb][i][k]))
                tmpInImage[rgb][i + 1][k + 1] = float(inImage[rgb][i][k])

    for rgb in range(RGB):
        for i in range(1, inH + 1):
            for k in range(1, inW + 1):
                # 각 점을 처리
                S = 0.0
                for m in range(mSize):
                    for n in range(mSize):
                        S += mask[rgb][m][n] * tmpInImage[rgb][m + i - 1][n + k - 1]
                tmpOutImage[rgb][i - 1][k - 1] = S

    for rgb in range(RGB):
        for i in range(outH):
            for k in range(outW):
                if tmpOutImage[rgb][i][k] > 255:
                    outImage[rgb][i][k] = 255
                elif tmpOutImage[rgb][i][k] < 0:
                    outImage[rgb][i][k] = 0
                else:
                    outImage[rgb][i][k] = int(tmpOutImage[rgb][i][k])

    ########################
    displayImageColor()

## 전역 변수부
from tkinter import Tk
window, canvas, paper = None, None, None
inImage, outImage = [], []
inH, inW, outH, outW = [0] * 4
filename = '',
cvInImage, cvOutImage = None,None
RGB, R, G, B = 3,0,1,2
count = 0
## 메인 코드부
if __name__ == '__main__' :
    window = Tk()
    window.title('그레이 영상처리 Ver 0.02')
    window.geometry('512x512')
    window.resizable(height=False, width=False)

    ##Loading 상태바 구현
    status = Label(window, text='이미지정보 : ',bd=1, relief=SUNKEN, anchor=W);
    status.pack(side=BOTTOM, fill=X);

    ### 메뉴 만들기 ###
    mainMenu = Menu(window)
    window.configure(menu=mainMenu)
    fileMenu = Menu(mainMenu)
    mainMenu.add_cascade(label="파일", menu=fileMenu)
    fileMenu.add_command(label="열기(Open)", command=openFile)
    fileMenu.add_command(label="저장(Save)", command=saveFile)
    fileMenu.add_separator()
    fileMenu.add_command(label="닫기(Close)")

    pixelMenu = Menu(mainMenu)
    mainMenu.add_cascade(label="화소점 처리", menu=pixelMenu)
    pixelMenu.add_command(label="동일영상", command=equalColor)
    pixelMenu.add_command(label="밝게하기", command=addColor)
    pixelMenu.add_command(label="그레이스케일", command=grayColor)


    # pixelMenu.add_command(label="감마연산", command=gammaImage)
    # pixelMenu.add_command(label="파라볼라(캡)_COLOR", command=paraCapImage)
    # pixelMenu.add_command(label="파라볼라(컵)_COLOR", command=paraCupImage)
    pixelMenu.add_command(label="감마연산", command=gammaColor)
    pixelMenu.add_command(label="파라볼라(캡)_COLOR", command=paraCapColor)
    pixelMenu.add_command(label="파라볼라(컵)_COLOR", command=paraCupColor)
    pixelMenu.add_command(label="이진화(기본)_COLOR", command=bw1Color)
    # pixelMenu.add_command(label="이진화(기본)", command=bw1Image)
    pixelMenu.add_command(label="이진화(평균)_COLOR", command=bw2Color)
    # pixelMenu.add_command(label="이진화(평균)", command=bw2Image)
    pixelMenu.add_command(label="이진화(중위수)_COLOR", command=bw3Color)
    # pixelMenu.add_command(label="이진화(중위수)", command=bw3Image)
    # pixelMenu.add_command(label="범위강조 변환_COLOR", command=point2Color)
    # pixelMenu.add_command(label="범위강조 변환", command=point2Image)

    # geometryMenu = Menu(mainMenu)
    # mainMenu.add_cascade(label="기하학 처리", menu=geometryMenu)
    # geometryMenu.add_command(label="영상 이동", command=moveImage)
    # geometryMenu.add_command(label="영상 축소", command=zoomoutImage)
    # geometryMenu.add_command(label="영상 축소(백워딩)", command=zoomout2Image)
    # geometryMenu.add_command(label="영상 확대", command=zoominImage)
    # geometryMenu.add_command(label="영상 확대(백워딩)", command=zoomin2Image)
    # geometryMenu.add_command(label="영상 확대(양선형)", command=zoomin2Image)
    # geometryMenu.add_command(label="영상 회전", command=rotateImage)
    # geometryMenu.add_command(label="영상 회전(중심, 백워딩)", command=rotate2Image)

    areaMenu = Menu(mainMenu)
    mainMenu.add_cascade(label="화소영역 처리", menu=areaMenu)
    # areaMenu.add_command(label="엠보싱", command=embossImage)
    # areaMenu.add_command(label="블러링", command=blurrImage)
    areaMenu.add_command(label="샤프닝", command=sharpColor)
    # areaMenu.add_command(label="샤프닝", command=sharpImage)
    # areaMenu.add_command(label="고주파 필터 통과 샤프닝", command=sharp2Image)
    # areaMenu.add_command(label="Unsharp Masking", command=sharp3Image)
    # areaMenu.add_command(label="High-Boost", command=sharp4Image)
    # areaMenu.add_command(label="유사 연산자", command=OnHomogenOperator)
    # areaMenu.add_command(label="차연산자", command=sharp4Image)
    ######################

    window.mainloop()