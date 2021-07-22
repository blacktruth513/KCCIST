from django.urls import path
#from django.conf.urls import patterns, url
from . import views, viewsSimulator


urlpatterns = [
    path('',views.index, name='index'),
    #path('<word>/',viewsSimulator.radioTheme, name='radioTheme'),
    path('radioTheme/',viewsSimulator.radioTheme, name='radioTheme'),
    path('radioStock/',viewsSimulator.radioStock, name='radioStock'),
    path('radioTerm/',viewsSimulator.radioTerm, name='radioTerm'),
    path('radioData/',viewsSimulator.radioData, name='radioData'),
    path('radioModel/',viewsSimulator.radioModel, name='radioModel'),
    path('radioPredictDate/',viewsSimulator.radioPredictDate, name='radioPredictDate'),


    path('clkTrain/', viewsSimulator.ChartAPIView.as_view(), name="clkTrain"),
    # path('chart', viewsSimulator.ChartView.as_view(), name="chart"),
    path('saveModel/',viewsSimulator.saveModel, name='saveModel'),
    path('syncData/',viewsSimulator.syncData, name='syncData'),


    path('data_sync/',views.data_sync, name='data_sync'),
    path('elements/',views.elements, name='elements.html'),
    path('icons/',views.icons, name='icons.html'),
]