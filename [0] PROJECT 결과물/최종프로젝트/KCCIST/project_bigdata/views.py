from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from datetime import datetime
import random

def index(request) :
    context = {}
    return render(request, 'Simulator.html', context)


def data_sync(request) :
    print("데이터 동기화 버튼")
    return render(request, 'Simulator.html')


def elements(request) :
    print("PAGE : elements")
    return render(request, 'elements.html')


def icons(request) :
    print("PAGE : icons")
    return render(request, 'icons.html')
