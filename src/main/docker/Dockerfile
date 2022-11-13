FROM ffmpeg_jdk:zhibo
VOLUME /opt/tmp
ADD gb28181-client-1.0-SNAPSHOT.jar /app.jar
ADD videofile.h264 /videofile.h264
ADD record.h264 /record.h264
ADD deviceInfo.xml /deviceInfo.xml
ADD recordInfo.xml /recordInfo.xml
ADD catalog.xml /catalog.xml
ENV TZ=Asia/Shanghai
ENV LANG C.UTF-8
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
