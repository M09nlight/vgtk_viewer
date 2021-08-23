using Microsoft.AspNetCore.Mvc;
using Store.Data.Interface;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Store.Web.Controllers
{
    public class BrandController : Controller
    {
        private IUnitOfWork unitOfWork;

        public BrandController(IUnitOfWork unitOfWork)
        {
            this.unitOfWork = unitOfWork;
        }

        public IActionResult Index()
        {
            var brand = unitOfWork.BrandRepository.GetAll();
            return View(brand);
        }
    }
}
