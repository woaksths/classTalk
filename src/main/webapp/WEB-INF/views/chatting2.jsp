<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/chatting.css">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet">

<body background="blue">
	<div class="container ">
		<div class="col-md-6 col-lg-3">
			<div class="panel">
				<!--Heading-->
				<div class="panel-heading">
					<div class="panel-control">
						<div class="btn-group">
							<button class="btn btn-default" type="button"
								data-toggle="collapse" data-target="#demo-chat-body">
								<i class="fa fa-chevron-down"></i>
							</button>
							<button type="button" class="btn btn-default"
								data-toggle="dropdown">
								<i class="fa fa-gear"></i>
							</button>
						</div>
					</div>
					<h3 class="panel-title" style="font-size: large;">SoftWare
						Engineering</h3>
				</div>

				<!--Widget body-->
				<div id="demo-chat-body" class="collapse in" style="width: 700px">
					<div class="nano has-scrollbar" style="height: 380px">
						<div class="nano-content pad-all" tabindex="0"
							style="right: -17px;">
							<ul class="list-unstyled media-block">

								<li class="mar-btm">
									<div class="media-left">
										<img src="https://bootdey.com/img/Content/avatar/avatar2.png"
											class="img-circle img-sm" alt="Profile Picture">
									</div>
									<div class="media-body pad-hor speech-left">
										<div class="speech">
											<a href="${pageContext.request.contextPath}/popup.do"
												onclick="window.open(this.href,'_blacnk','width=600,height=400'); return false"
												class="media-heading" data-toggle="modal"
												data-target="#myModal">STUDENT</a>
											<p>애자일 기법에 대하여 알고싶습니다.</p>
											<p class="speech-time">
												<i class="fa fa-clock-o fa-fw"></i> 09:23AM
											</p>
										</div>

									</div>
								</li>
								<li class="mar-btm">
									<div class="media-left">
										<img src="https://bootdey.com/img/Content/avatar/avatar1.png"
											class="img-circle img-sm" alt="Profile Picture">
									</div>
									<div class="media-body pad-hor">
										<div class="speech">
											<a href="#" class="media-heading">STUDENT</a>
											<p>Shipment is free. You\'ll get your shoes tomorrow!</p>
											<p class="speech-time">
												<i class="fa fa-clock-o fa-fw"></i> 09:25
											</p>
										</div>
									</div>
								</li>


								<li class="mar-btm">
									<div class="media-left">
										<img src="https://bootdey.com/img/Content/avatar/avatar1.png"
											class="img-circle img-sm" alt="Profile Picture">
									</div>
									<div class="media-body pad-hor">
										<div class="speech">
											<a href="${pageContext.request.contextPath}/popup.do"
												onclick="window.open(this.href,'_blacnk','width=600,height=400'); return false"
												class="media-heading" data-toggle="modal"
												data-target="#myModal">STUDENT</a>
											<p>
												You are welcome! <br> 코딩 너무어려워요
											</p>
											<p class="speech-time">
												<i class="fa fa-clock-o fa-fw"></i> 09:30
											</p>
										</div>
									</div>
								</li>

								<li class="mar-btm">
									<div class="media-left">
										<img src="https://bootdey.com/img/Content/avatar/avatar1.png"
											class="img-circle img-sm" alt="Profile Picture">
									</div>
									<div class="media-body pad-hor">
										<div class="speech">
											<a href="#" class="media-heading">STUDENT</a>
											<p>Thank you for contacting us today</p>
											<p class="speech-time">
												<i class="fa fa-clock-o fa-fw"></i> 09:32
											</p>
										</div>
									</div>
								</li>

								<li class="mar-btm">
									<div class="media-left">
										<img src="https://bootdey.com/img/Content/avatar/avatar2.png"
											class="img-circle img-sm" alt="Profile Picture">
									</div>
									<div class="media-body pad-hor speech-left">
										<div class="speech">
									<a href="${pageContext.request.contextPath}/popup.do"
												onclick="window.open(this.href,'_blacnk','width=600,height=400'); return false"
												class="media-heading" data-toggle="modal"
												data-target="#myModal">STUDENT</a>
											<p>아 진짜 지루하다 수업!!!!!!!!!!!</p>
											<p class="speech-time">
												<i class="fa fa-clock-o fa-fw"></i> 09:23AM
											</p>
										</div>
									</div>
								</li>
							</ul>
						</div>
						<div class="nano-pane">
							<div class="nano-slider"
								style="height: 141px; transform: translate(0px, 0px);"></div>
						</div>
					</div>

					<!--Widget footer-->
					<div class="panel-footer">
						<div class="row">
							<div class="col-xs-9"></div>
							<div class="col-xs-3">
								<button class="btn btn-primary btn-block" type="submit">Send</button>
								<input type="text" class="form-control chat-input" size="80"
									width="30" height="50">

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>